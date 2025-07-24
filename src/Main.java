//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("HW2");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4.0;
        System.out.println(dog);
        cat = cat + 4.0;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var fighterAndy = 78.2;
        System.out.println(fighterAndy);
        var fighterRomirez = 82.7;
        System.out.println(fighterRomirez);
        var totalMass = fighterAndy + fighterRomirez;
        System.out.println(totalMass);
        var weightDifference = fighterRomirez - fighterAndy;
        System.out.println(weightDifference);
        weightDifference = fighterRomirez % fighterAndy;
        System.out.println(weightDifference);
        var workingHours = 640;
        System.out.println(workingHours);
        var standartHours = 8;
        System.out.println(standartHours);
        var numberEmployees = workingHours / standartHours;
        System.out.println("Всего работников в компании - " + numberEmployees + " человек");
        numberEmployees = numberEmployees + 94;
        System.out.println(numberEmployees);
        workingHours = numberEmployees * 8;
        System.out.print("Если в компании работает " + numberEmployees + " человека, то всего " + workingHours + " часов работы может быть поделено между сотрудниками");










        for (int i = 1; i <= 5; i++) {


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}