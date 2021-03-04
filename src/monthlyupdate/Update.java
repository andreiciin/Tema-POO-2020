package monthlyupdate;

import consumers.Consumers;
import cost.Cost;

import java.util.ArrayList;
import java.util.List;

public final class Update {

  private List<Consumers> newConsumers = new ArrayList<>();
  private List<Cost> costsChanges = new ArrayList<>();

  // constructor
  public Update(final List<Consumers> newConsumers, final List<Cost> costsChanges) {
    this.newConsumers = newConsumers;
    this.costsChanges = costsChanges;
  }

  // getters and setters
  public List<Consumers> getNewConsumers() {
    return newConsumers;
  }

  public void setNewConsumers(final List<Consumers> newConsumers) {
    this.newConsumers = newConsumers;
  }

  public List<Cost> getCostsChanges() {
    return costsChanges;
  }

  public void setCostsChanges(final List<Cost> costsChanges) {
    this.costsChanges = costsChanges;
  }
}
