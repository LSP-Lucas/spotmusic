package br.com.devmedia.service;

import br.com.devmedia.dao.PlaylistDAO;
import br.com.devmedia.domain.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistDAO playlistDAO;

    @Override
    public void salvar(Playlist playlist) {
        playlistDAO.salvar(playlist);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Playlist> recuperar() {
        return playlistDAO.recuperar();
    }

    @Override
    @Transactional(readOnly = true)
    public Playlist recuperarPorId(long id) {
        return playlistDAO.recuperarPorID(id);
    }

    @Override
    public void atualiar(Playlist playlist) {
        playlistDAO.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistDAO.excluir(id);
    }
}
