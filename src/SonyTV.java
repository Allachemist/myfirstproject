public class SonyTV implements ITV {
  @Override
  public int increaseVolume(){
      return 0;
}

  @Override
  public int decreaseVolume() {

      return 0;
      }
}

public class TV implements ITV {
    privat int chanel;
    privat int chanelsAmount;
    privat int chips;

    privat int volume;
    privat static final int MAX_VOLUME = 200;
    privat static final int MIN_VOLUME = 0;

    privat int getMinVolume() {
        return MIN_VOLUME;

    }

    private int getChips(){
        return this.chips;
    }
    @Override
    public int increaseVolume() {
        if (getChips() ==0 {
            System.out.println("Сходи у ремонт");
        }
        if (this.volume !=MAX_VOLUME){
            this.volume++;
        }
        return this.volume;
    }


    @Override
    public int decreaseVolume() {
        if (this.volume == getMinVolume()) {
            return MIN_VOLUME;
    }
    return this.volume--; // this.volume -1;
    return this.volume;

}
  private int decreaseVolumeRealization3() {
      int resultVolume;
      if (this.volume == getMinVolume()) {
          resultVolume = this.volume - 1;
          this.volume--;
      }
      return resultVolume;
  }

}
