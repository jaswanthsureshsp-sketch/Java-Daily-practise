interface Animal {
    void eat();
        }

        interface Dog extends Animal {
    void bark();
        }

        class puppy implements Dog {
    public  void eat(){
        System.out.println("Puppuy eats");
    }
    public void bark(){
        System.out.println("Puppy Barks");
    }
        }


        class Geeks37 {
    public static void main(String[] args){
        puppy p = new puppy();
        p.eat();
        p.bark();
    }
        }
