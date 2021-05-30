public class OpenFileCommand implements Command{
    private FileSystemReceiver fileSystem;

    // store previous state for undo, String someState -> State pattern

    public OpenFileCommand(FileSystemReceiver fs){
        fileSystem = fs;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called      someState = .....;
        this.fileSystem.openFile();
    }

    //public void undo(){
        // restore previous state
        // myMemberVariable = previousState;
    //}
}
