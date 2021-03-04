package distributors;

import consumers.Contracts;

import java.util.ArrayList;

public final class OutDistributors {

  private long id;
  private long budget;
  public boolean isBankrupt;
  private ArrayList<Contracts> contracts;

  public OutDistributors(final long id, final long budget, final boolean isBankrupt,
                         final ArrayList<Contracts> contracts) {
    this.id = id;
    this.budget = budget;
    this.isBankrupt = isBankrupt;
    this.contracts = contracts;
  }

  public ArrayList<Contracts> getContracts() {
    return contracts;
  }

  public void setContracts(final ArrayList<Contracts> contracts) {
    this.contracts = contracts;
  }

  public long getId() {
    return id;
  }

  public void setId(final long id) {
    this.id = id;
  }

  public long getBudget() {
    return budget;
  }

  public void setBudget(final long budget) {
    this.budget = budget;
  }
}
