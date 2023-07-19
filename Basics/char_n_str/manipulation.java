package Basics.char_n_str;

public class manipulation {
    public static void main(String[] args) {
        System.out.println("Hello World, I am running in OpenSuse. And am run by a failure in VsCode");

        String sambodhan = "World";
        String system = "OpenSuse";
        String type = "failure";
        String ide = "VsCode";

        System.out.println(
                "Hello " + sambodhan + ", I am running in " + system +
                        ". And am run by a " + type
                        + " in " + ide);

        // ? %s is for strings, there are &d, %f, %c, %b etc like in C++
        String decomplicate = String.format("Hello %s, I am running in %s. And am run by a %s in %s", sambodhan, system,
                type, ide);
        System.out.println(decomplicate);
        // ! Theres still printf with System.out.printf
    }
}
