#!/bin/bash

# Confirm the action
read -p "This will delete the commit history of your repository. Continue? (y/n) " -n 1 -r
echo
if [[ ! $REPLY =~ ^[Yy]$ ]]
then
    exit 1
fi

# Create a new orphan branch
git checkout --orphan temp_branch

# Add all the files and commit them
git add -A
git commit -am "Initial commit"

# Delete the master branch
git branch -D master

# Rename the temporary branch to master
git branch -m master

# Forcefully update the remote repository
git push -f origin master

# Clean up
git branch -D temp_branch
git prune --progress
git gc --aggressive

echo "Commit history has been cleared!"
