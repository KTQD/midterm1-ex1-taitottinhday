public astract class Item {
  1 usages
  pubic String name;
//private attribute with getter and setter
  3 usages
  private String description;

  no usages
  public String Getdescription(){
    return description;
  }

  no usages

  public void setDescription(String description){
    this.description=description;
  }
  //protected attribute
  1 usages
  protected String ID;
  //Default attribute
  1 usages
  float price;

  //abstract method
  no usages
  abstract void showInfo();
  //constructor with parameters
  no usages
  public AbstractItem(String name;String description,String ID,float price){
    this.name=name;
    this.description=description;
    this.ID=ID;
    this.price=price;
  }
} 
  

  
  
}
