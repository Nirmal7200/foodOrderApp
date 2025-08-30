package in.nirmal.foodiesapi.service;

import in.nirmal.foodiesapi.io.FoodRequest;
import in.nirmal.foodiesapi.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FoodService {

   String uploadFile(MultipartFile file);

   FoodResponse addFood(FoodRequest request, MultipartFile file);

}
