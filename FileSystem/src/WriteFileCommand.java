public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    // store previous state for undo, String someState -> State pattern

    public WriteFileCommand(FileSystemReceiver fs){
        fileSystem = fs;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called      someState = .....;
        this.fileSystem.writeFile();
    }
}
