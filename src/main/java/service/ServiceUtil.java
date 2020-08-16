package service;

import DAO.HumanDAO;
import model.Human;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUtil {
    private final HumanDAO humanDAO = new HumanDAO();

    public Human getHumanById(int id){
        return humanDAO.getById(id);
    }

    public List<Human> getAllPeople(){
        return humanDAO.getAll();
    }
}
