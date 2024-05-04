// NoteTable.java
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.Scene;
import java.util.List;
import java.util.ArrayList;

public class NoteTable extends Application{
    //
    // GUI controls
    //
    private TableView<Note> noteTableView;

    //
    // Data model
    //
    private Job job;

    @SuppressWarnings("unchecked")
    @Override
    public void start(Stage stage) {
        this.job = new Job();
        List<Integer> velocities = new ArrayList<Integer>();
        velocities.add(40);
        velocities.add(60);
        velocities.add(80);
        velocities.add(100);
        this.job.setSpecificVelocities(velocities);
        System.out.println(this.job);

        List<Note> notes = new ArrayList<Note>();
        int noteStartTime = 0;
        int noteEndtime = 0;
        for(int note : this.job.getNotes()){
            for(int velocity : this.job.getVelocities()) {
                noteEndtime = noteStartTime + this.job.getNoteDuration();
                Note n = new Note(note, velocity, noteStartTime, noteEndtime);
                notes.add(n);

                noteStartTime +=
                    this.job.getNoteDuration()
                    + this.job.getNoteDecay()
                    + this.job.getNoteGap();
            }
        }

        System.out.println("Total number of notes = " + notes.size());

        ObservableList<Note> noteList = FXCollections.observableArrayList();
        noteList.addAll(notes);

        this.noteTableView = new TableView<Note>();

        // Use the Note class that was purpose created for this task;
        TableColumn<Note, Integer> noteColumn = new TableColumn<>("Note");
        TableColumn<Note, Integer> velocityColumn = new TableColumn<>("Velocity");
        TableColumn<Note, Integer> noteStartColumn = new TableColumn<>("Start(ms)");
        TableColumn<Note, Integer> noteEndColumn = new TableColumn<>("End (ms)");

        // The value factory instances use the JavaBeans naming convention
        // to get values from the note instances. For example, "number" means
        // the value is retrieved using the getNumber()method, etc.

        noteColumn.setCellValueFactory(new PropertyValueFactory<>("velocity"));
        velocityColumn.setCellValueFactory(new PropertyValueFactory<>("velocity"));
        noteStartColumn.setCellValueFactory(new PropertyValueFactory<>("startTime"));
        noteEndColumn.setCellValueFactory(new PropertyValueFactory<>("endTime"));

        this.noteTableView.getColumns().addAll(
            noteColumn,
            velocityColumn,
            noteStartColumn,
            noteEndColumn
        );

        this.noteTableView.setItems(noteList);

        VBox box = new VBox(this.noteTableView);

        stage.setTitle("Note Table");
        Scene scene = new Scene(box, 400, 405);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args){
        launch();
    }

}