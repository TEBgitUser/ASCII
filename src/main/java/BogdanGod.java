public class BogdanGod {
    private int age=18;
    private String gender="male";
    private boolean czyKacpertoDEBIL=true;
    public String nameTown(){
        return "Poznan";
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCzyKacpertoDEBIL() {
        return czyKacpertoDEBIL;
    }

    @Override
    public String toString() {
        return "BogdanGod{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", czyKacpertoDEBIL=" + czyKacpertoDEBIL +
                '}';
    }
}
