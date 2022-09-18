//>public-> Any where even if it is not subclass and any package
//>protected,-> If it is a different package then it must be a subclass
//>default,->Only same package
//>private-> Only same class
class Parent {
    String s = "Parent";
}

class Child extends Parent {
    String s = "child";

    String getSuperS() {
        return super.s;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.s);
    }
}
