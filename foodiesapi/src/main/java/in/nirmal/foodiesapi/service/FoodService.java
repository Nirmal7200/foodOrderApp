package in.nirmal.foodiesapi.service;

import in.nirmal.foodiesapi.io.FoodRequest;
import in.nirmal.foodiesapi.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FoodService {

   String uploadFile(MultipartFile file);

   FoodResponse addFood(FoodRequest request, MultipartFile file);

   List<FoodResponse> readFoods();

   FoodResponse readFood(String id);

   boolean deleteFile(String filename);

   void deleteFood(String id);

}
