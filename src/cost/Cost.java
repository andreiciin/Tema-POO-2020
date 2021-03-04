package cost;

public final class Cost {

  private long id;
  private long infrastructureCost;
  private long productionCost;

  // constructor
  public Cost(final long id, final long infrastructureCost, final long productionCost) {
    this.id = id;
    this.infrastructureCost = infrastructureCost;
    this.productionCost = productionCost;
  }

  // getters and setters
  public long getId() {
    return id;
  }

  public void setId(final long id) {
    this.id = id;
  }

  public long getInfrastructureCost() {
    return infrastructureCost;
  }

  public void setInfrastructureCost(final long infrastructureCost) {
    this.infrastructureCost = infrastructureCost;
  }

  public long getProductionCost() {
    return productionCost;
  }

  public void setProductionCost(final long productionCost) {
    this.productionCost = productionCost;
  }
}
