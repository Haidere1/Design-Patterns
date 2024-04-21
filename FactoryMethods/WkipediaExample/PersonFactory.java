package FactoryMethods.WkipediaExample;

// PersonFactory.java
public class PersonFactory {
    public IPerson getPerson(PersonType type) {
        switch (type) {
            case Rural:
                return new Villager();
            case Urban:
                return new Cityperson();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
