import java.util.Objects;
 abstract class AHuman implements IHuman{
     protected String name;
     protected TypeOfHands typeOfHand;
     protected Place place;
      @Override
      public int hashCode() {
           return Objects.hash(name);
      }

      @Override
      public boolean equals(Object o) {
           if (this == o) return true;
           if (o == null || getClass() != o.getClass()) return false;
           AHuman aHuman = (AHuman) o;
           return Objects.equals(name, aHuman.name);
      }
      @Override
      public String toString(){
           return "Human" +
                   "name = '" + name;
      }
      public String getName() {
           return this.name = name;
      }
      public TypeOfHands setTypeOfHand(TypeOfHands f) {
           return this.typeOfHand = f;
      }
     public Place setPlace(Place place) {
         return this.place = place;
     }

     public  Place getPlace() {
         return place;
     }
     public String wave() {
         if (typeOfHand == TypeOfHands.CHUBBY) {
             return (name + " махнул в ответ своей пухленькой ручкой.");
         } else {
             return (name + " восторженно замахал тряпкой.");
         }
     }


     @Override
     public String walk(Place place) {
         return this.name + " идет в " + place.getName();
     }
 }

