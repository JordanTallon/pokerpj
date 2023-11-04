package ie.dcu.computing.ca314.g10.pokerproject.interfaces;

public interface Playable {
  /**
   * Allows the player to check.
   */
  void check();
  /**
   * Allows the player to place a bet.
   *
   * @param amount The amount to bet.
   */
  void bet(int amount);
  /**
   * Allows the player to fold.
   */
  void fold();
  /**
  * Allows the player to raise the
  current bet.
  */
  void raise();
  /**
  * Allows the player to call / match the
  current highest bet.
  */
  void call();
  /**
  * Allows the player to go all-in (bet
  all of their chips).
  */
  void goAllIn();
}