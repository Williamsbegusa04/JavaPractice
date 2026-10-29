package day17;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class TypeCastingObjects2 {

   /* A b = (c)d  ;*/

    //Rule 1: Conversion is valid
    // The type of D and c must have a relationship
    Animal an = new Dog();
    Cat ct = (Cat) an;                    //an type animal and Cat type have a relationship so conversion is valid

    Dog dg = new Dog();
    /*Cat ct =(Cat) dg;*/       //invalid per rule 1

    //Rule2 Assignment is valid
    //'C' must be the same type or child of A type
    Animal an2 = new Dog();
    Cat ct2 = (Cat) an2;                   //valid per rule 2
//    Cat ct3 = (Dog)an2;                   //invalid per rule 2

    //Rule3
    //The underlying object of D must be the same or Child of C
    Animal an3 = new Dog();
    Cat ct4 = (Cat)an3;       //invalid per rule 3

    //Rule1,2,3
    Animal an4 = new Dog();
    Dog dg2 = (Dog)an4;

}

