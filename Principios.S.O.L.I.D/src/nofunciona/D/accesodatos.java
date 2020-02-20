package nofunciona.D;

public class accesodatos {

    private DatabaseService databaseService;

    public accesodatos(DatabaseService databaseService){
        this.databaseService = databaseService;
    }

    public void getDatos(){
        databaseService.getDatos();
        //...
    }
}
