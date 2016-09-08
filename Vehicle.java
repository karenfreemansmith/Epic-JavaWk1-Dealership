class Vehicle {
  private int mYear;
  private String mBrand;
  private String mModel;
  private int mMiles;
  private int mPrice;

  public Vehicle(int year, String brand, String model, int miles, int price) {
    mYear=year;
    mBrand=brand;
    mModel=model;
    mMiles=miles;
    mPrice=price;
  }

  public boolean worthBuying(int maxPrice) {
    return(mPrice<maxPrice);
  }

  public int getYear() {
    return mYear;
  }
  
  public String getBrand() {
    return mBrand;
  }

  public String getModel() {
    return mModel;
  }

  public int getMiles() {
    return mMiles;
  }

  public int getPrice() {
    return mPrice;
  }
}
