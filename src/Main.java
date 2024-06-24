//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileSystemReceiver receiver = new UnixFile();

        Command createFileCommand = new CreateFileCommand(receiver);
        Command deleteFileCommand = new DeleteFileCommand(receiver);
        Command copyFileCommand = new CopyFileCommand(receiver);

        FileInvoker invoker = new FileInvoker(createFileCommand);
        invoker.execute();

        invoker.setCommand(deleteFileCommand);
        invoker.execute();

        invoker.setCommand(copyFileCommand);
        invoker.execute();

    }
}