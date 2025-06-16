package org.example.pratica.repository;

import org.example.pratica.model.ItemPedido;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ItemPedidoRepository implements JpaRepository<ItemPedido, Long> {
    @Override
    public void flush() {
    }

    @Override
    public <S extends ItemPedido> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ItemPedido> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<ItemPedido> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ItemPedido getOne(Long aLong) {
        return null;
    }

    @Override
    public ItemPedido getById(Long aLong) {
        return null;
    }

    @Override
    public ItemPedido getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ItemPedido> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ItemPedido> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends ItemPedido> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends ItemPedido> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ItemPedido> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ItemPedido> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ItemPedido, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ItemPedido> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ItemPedido> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<ItemPedido> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<ItemPedido> findAll() {
        return List.of();
    }

    @Override
    public List<ItemPedido> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ItemPedido entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ItemPedido> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ItemPedido> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<ItemPedido> findAll(Pageable pageable) {
        return null;
    }
}

 