package dio.myFirstWebApi.hendler;

public class RequiredFieldException extends BusinessException{

    public RequiredFieldException(String field){
        super("Field %s is Required !", field);
    }
}
