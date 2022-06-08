package TypesVariablesArrays;

// compute distance light travels using long variables.
public class Light {
    public static void main(String[] args) {
        lightSpeed();
    }

    static void lightSpeed() {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;
        days = 1000; // specify the number of days
        seconds = days*24*60; // convert to seconds
        distance = lightspeed*seconds; // compute distance

        System.out.print("In "+days);
        System.out.print(" days light will travel about  ");
        System.out.print(distance + " miles.");
    }
}

/*
* Notes to self: CTRL+SHIFT+D to duplicate lines in IntelliJ
* */