class Conditionals {

    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if (boolean expression True or False) {
                // body (do this)
            } else {
                // do this
            }
        */

        int salary = 2249800;
//        if (salary > 100000) {
//            salary = salary + 33000;
//        } else {
//            salary = salary + 1000;
//        }

        // multiple if-else

        if (salary > 100000) {
             salary += 33000; // salary = salary + 2000
        } else if (salary > 200000) {
            salary += 30000;
        } else {
            salary += 67000;
        }

        System.out.println(salary);
    }
}
//         int a = 22;
//         int b = 33;

//         if (a != 0) {
//             System.out.println("Hello World");
//         }
//     }
// }