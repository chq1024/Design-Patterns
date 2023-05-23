package builder.example1;

/**
 * @author bk
 */
public  class Person {

    private String name;
    private String nickName;

    private Person(Builder builder) {
        this.name = builder.name;
        this.nickName = builder.nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public static class Builder {
        private String name;
        private String nickName;

        public Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
