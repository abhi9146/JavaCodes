package example;

public class subClassSamePack extends parentClass {
    public void accessParentVariables() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        // Cannot access privateVar directly
        // Access it through a method in the ParentClass if needed
    }

}
