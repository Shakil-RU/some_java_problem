public class ComboLock_practice {
    public int _secret1, _secret2, _secret3;
    public int _status,_current;
    public ComboLock_practice(int secret1,int secret2, int secret3){
        _secret1 = secret1;
        _secret2 = secret2;
        _secret2 = secret3;
        _status = 0;
        _current = 0;

    }
    public void Reset(){
        _status = 0;
        _current = 0;
        System.out.println("Lock is Reset");
    }
             public void turnRight(int ticks){
                 _current = _current + ticks;
                 if(_current>39){
                     _current = _current-39;
                     if(_status = 0 && _current = _secret1){
                         _status = 1;
                     }
                     else if(_status=2 && _current = _secret3){
                         _status = 3;
                     }
                     else{
                         _status = 0;
                     }
    }


    public static void main(String[] args) {
        ComboLock_practice LOckobj = new ComboLock_practice(36,24,36);
        LOckobj.Reset();
        LOckobj.turnRight(36);
        LOckobj.turnLeft(12);
LOckobj.turnRight(12);
        boolean ok= LOckobj.open();
        if(ok==true){
            System.out.println("Lock is open");
        }
        else{
            System.out.println("Lock doesn`t open");
        }

    }

    private boolean open() {

    }

    private void turnLeft(int ticks) {
            _current = _current - ticks;
            if(_current<39){
                _current=_current+ticks;
            }
            if(_status=1 && _current = _secret2){
                _status=_secret2;
            }
            else{
                _status = 0;
            }

    }
}