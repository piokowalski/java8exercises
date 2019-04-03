public class Main {

    public static void main(String[] args) {

        Task o = new Task() {
            @Override
            public void doWork() {
                System.out.println("Hello from " +
                        getClass().getName());
            }
        };

        carryOutWork(new Task() {
            @Override
            public void doWork() {

            }
        });

        //wywolanie runJob 1. klAnonimowa 2. lambda

        //po staremu:
        runJob(new Runnable() {
            @Override
            public void run() {
                System.out.println("Old style!");
            }
        });

//        po nowemu
        runJob(() -> System.out.println("New lambda style!"));

        runJob(() ->{
            System.out.println("New lambda style2!");
        });

    }

    public static void runJob(Runnable runnable) {
        runnable.run();
    }


    public static void carryOutWork(Task task) {
        task.doWork();

    }

}
