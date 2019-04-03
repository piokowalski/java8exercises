public class Main {

    public static void main(String[] args) {


        Task o = new MyTask();
        carryOutWork(o);



    }


    public static void carryOutWork(Task task) {
        task.doWork();

    }

}
