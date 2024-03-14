public class MP3 extends Item {
  3 usages
  private int duration;
  1 usages
  public MP3(String name, String description, String ID, float price, int duration) {
      super(name, description, ID, price);
      this.duration = duration;
  }
 no usages
    public int getDuration() {
        return duration;
    }
no usages
  public void setDuration(int duration) {
        this.duration = duration;
    }
}

}
