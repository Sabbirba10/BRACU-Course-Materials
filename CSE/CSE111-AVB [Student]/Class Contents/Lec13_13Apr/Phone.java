package Lec13_13Apr;

class Phone {
  static String brand = "Samsung";
  String model;
  static double version = 15.0;

  Phone(String model) {
    this.model = model;
  }

  void details() {
    System.out.print(brand + " " + model);
    System.out.println("> android " + version);
  }

  static void updateVersion(double newVersion) {
    version = newVersion;
    System.out.println("Update available on all phones.");
  }
}