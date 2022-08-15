import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public class Stream_Copy {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Stream_Copy.class);

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person(1, "Manoj", 27, "Houston");
        Person person2 = new Person(2, "Dixit", 27, "Nashville");
        Person person3 = new Person(3, "Rajesh", 28, "Cookeville");
        Person person4 = new Person(4, "Venky", 29, "Herndon");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        List<Person> personList2 = new ArrayList<>();

//        personList2 = personList.stream().collect(Collectors.toList());

        for(Person person : personList){
            personList2.add(SerializationUtils.clone(person));
        }

        for(Person person : personList){
            System.out.printf("object Id of a person in personList: %d \n", System.identityHashCode(person));
        }

        System.out.println("\n\n");

        for(Person person : personList2){

            System.out.printf("object Id of a person in personList2: %d \n", System.identityHashCode(person));
        }




    }
}
