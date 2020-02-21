package br.com.devmedia.dao;

import br.com.devmedia.domain.Playlist;

import java.util.List;

public interface PlaylistDAO {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPorID(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);
}
