/*
 * Author Name: Aditya Chaurasia
 * Date: 26-11-2022
 * Created With: IntelliJ IDEA Ultimate
 * Profile: github.com/ChaurasiaAditya
 * Website: ChaurasiaAditya.in
 */
package chaurasiaaditya.Employee_Manager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User Id Not Found")
public class UserNotFoundException extends Exception{
}
