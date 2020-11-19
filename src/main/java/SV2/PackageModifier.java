package SV2;

import SV2OtherPackage.PackageFail;

public class PackageModifier {
    public static void main(String[] args) {
        PackageSuccess success = new PackageSuccess();
        // This line of code compiles
        // Because the field x can be accessed from the same package
        int successTest = success.x;

        PackageFail fail = new PackageFail();
        // The below line of code does not compile
        // Because x is not a public field of PackageFail
        // int failTest = fail.x;
    }
}
