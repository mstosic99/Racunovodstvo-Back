package rs.raf.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.raf.model.Permission;
import rs.raf.repositories.PermissionRepository;
import rs.raf.services.IService;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionService implements IService<Permission, Long> {

    private final PermissionRepository permissionRepository;

    @Autowired
    public PermissionService(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    @Override
    public  Permission  save(Permission permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public Optional<Permission> findById(Long id) {
        return permissionRepository.findById(id);
    }

    @Override
    public List<Permission> findAll() {
        return permissionRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        permissionRepository.deleteById(id);
    }
}
