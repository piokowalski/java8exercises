public class Main {

    public static void main(String[] args) {


//        Task o = new MyTask();
//        carryOutWork(o);

        Task o = new Task() {
            @Override
            public void doWork() {
                System.out.println("Hello from " +
                        getClass().getName());
            }
        };

        carryOutWork(o);



    }


    public static void carryOutWork(Task task) {
        task.doWork();

    }

}
