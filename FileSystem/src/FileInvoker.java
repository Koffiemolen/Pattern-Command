public class FileInvoker {
    public Command command;

    public FileInvoker(Command comm){
        command = comm;
    }

    public void execute(){
        command.execute();
    }
}
