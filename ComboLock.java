public class ComboLock {
    private int _secret1,_secret2,_secret3;
    private int _status,_current;

    public ComboLock(int secret1,int secret2,int secret3){
        _secret1=secret1;
        _secret2=secret2;
        _secret3=secret3;
        _status=0;
        _current=0;

    }

    public void reset(){
        _status=0;
        _current=0;
        System.out.println("Lock is reset");
    }

    public void turnLeft(int ticks){
        _current=_current-ticks;
        if(_current<0){
            _current=39-_current;
        }
        if(_status==1 && _current==_secret2 ){
            _status=2;
        }
        else _status=0;

    }


    public  void  turnRight(int ticks){
        _current=_current+ticks;
        if(_current>39){
            _current=_current-39;
        }

        if(_status==0 && _current==_secret1){
            _status=1;
        }
        else if(_status==2 && _current==_secret3){
            _status=3;

        }
        else{
            _status=0;
        }
    }

    public boolean open(){
        if(_status==3) return true;
        else return false;
    }



    public static void main(String[] args) {
        ComboLock lock=new ComboLock(36,24,36);
        lock.reset();

        lock.turnRight(36);
        lock.turnLeft(12);
        lock.turnRight(12);


        boolean ok= lock.open();
        if(ok==true){
            System.out.println("Lock is open");
        }
        else{
            System.out.println("Lock doesn`t open");
        }


    }
}
