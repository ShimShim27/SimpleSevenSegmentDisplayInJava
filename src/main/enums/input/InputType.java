package main.enums.input;

public enum InputType {
    A("A"),B("B"),C("C"),D("D");
    private final String name;
    InputType(final String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
