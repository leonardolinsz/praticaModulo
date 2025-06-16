package org.example.pratica.repository;

import org.example.pratica.model.Mina;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MinaRepository implements JpaRepository<Mina, Long> {
    @Override
    public void flush() {
    }

    @Override
    public <S extends Mina> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Mina> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Mina> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Mina getOne(Long aLong) {
        return null;
    }

    @Override
    public Mina getById(Long aLong) {
        return null;
    }

    @Override
    public Mina getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Mina> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Mina> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Mina> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Mina> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Mina> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Mina> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Mina, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Mina> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Mina> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Mina> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Mina> findAll() {
        return List.of();
    }

    @Override
    public List<Mina> findAllById(Iterable<Long> longs) {
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
    public void delete(Mina entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Mina> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Mina> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Mina> findAll(Pageable pageable) {
        return null;
    }
}
