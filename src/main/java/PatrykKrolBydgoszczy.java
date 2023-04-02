public class PatrykKrolBydgoszczy {
    private int age=18;
    private String gender="male";
    private boolean czyKokaina =true;

    public String nazwaMiasta(){
        return "Bydgoszcz";
    }

    public int getAge() {
        return age;
    }

    public boolean isKokaina() {
        return czyKokaina;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PatrykKrolBydgoszczy{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", czy lubie kokaine=" + czyKokaina +
                '}';
    }
}
