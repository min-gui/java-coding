package streamprac;


public class UserDto {
    private int idx;
    private String name;
    private String gender;

    public UserDto(int idx, String name, String gender) {
        this.idx = idx;
        this.name = name;
        this.gender = gender;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
