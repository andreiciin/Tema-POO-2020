package inputs;

import consumers.Consumers;
import distributors.Distributors;
import monthlyupdate.Update;

import java.util.List;

/**
 * The class contains information about input
 *
 * <p>DO NOT MODIFY
 */
public final class Input {

  /** number of updates */
  private final long numberOfTurns;
  /** List of consumers */
  private final List<Consumers> consumers;
  /** List of distributors */
  private final List<Distributors> distributors;
  /** List of updates */
  private final List<Update> updates;

  public Input() {
    this.numberOfTurns = 0;
    this.consumers = null;
    this.distributors = null;
    this.updates = null;
  }

  public Input(
      final long numberOfTurns,
      final List<Consumers> consumers,
      final List<Distributors> distributors,
      final List<Update> updates) {
    this.numberOfTurns = numberOfTurns;
    this.consumers = consumers;
    this.distributors = distributors;
    this.updates = updates;
  }

  public long getNumberOfTurns() {
    return numberOfTurns;
  }

  public List<Consumers> getConsumers() {
    return consumers;
  }

  public List<Distributors> getDistributors() {
    return distributors;
  }

  public List<Update> getUpdates() {
    return updates;
  }
}
