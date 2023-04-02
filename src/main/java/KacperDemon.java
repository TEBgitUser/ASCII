public class KacperDemon {
    private int age=19;
    private String gender ="male";
    private boolean czyBogdantoCwel =true;
    public String nameMiasta(){
        return "Bydgoszcz";
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBogdantoCwel() {
        return czyBogdantoCwel;
    }

    @Override
    public String toString() {
        return "KacperDemon{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", isBogdantoCwel=" + czyBogdantoCwel +
                '}';
    }
}
