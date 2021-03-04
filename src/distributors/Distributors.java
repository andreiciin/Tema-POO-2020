package distributors;

// in aceasta clasa fac citirea distribuitorilor
public final class Distributors {

  private long id;
  private long contractLength;
  private long initialBudget;
  private long initialInfrastructureCost;
  private long initialProductionCost;

  // constructor
  public Distributors(
      final long id,
      final long contractLength,
      final long initialBudget,
      final long initialInfrastructureCost,
      final long initialProductionCost) {
    this.id = id;
    this.contractLength = contractLength;
    this.initialBudget = initialBudget;
    this.initialInfrastructureCost = initialInfrastructureCost;
    this.initialProductionCost = initialProductionCost;
  }

  // getters and setters
  public long getId() {
    return id;
  }

  public void setId(final long id) {
    this.id = id;
  }

  public long getContractLength() {
    return contractLength;
  }

  public void setContractLength(final long contractLength) {
    this.contractLength = contractLength;
  }

  public long getInitialBudget() {
    return initialBudget;
  }

  public void setInitialBudget(final long initialBudget) {
    this.initialBudget = initialBudget;
  }

  public long getInitialInfrastructureCost() {
    return initialInfrastructureCost;
  }

  public void setInitialInfrastructureCost(final long initialInfrastructureCost) {
    this.initialInfrastructureCost = initialInfrastructureCost;
  }

  public long getInitialProductionCost() {
    return initialProductionCost;
  }

  public void setInitialProductionCost(final long initialProductionCost) {
    this.initialProductionCost = initialProductionCost;
  }
}
