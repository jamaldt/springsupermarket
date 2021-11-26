package com.curso.democurso.persistence.mapper;

import com.curso.democurso.domain.Category;
import com.curso.democurso.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * System:                 CleanBnB
 * Name:                   CategoryMapper
 * Description:            Class that represents a CategoryMapper's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/25/21
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper
{
    @Mappings({
        @Mapping(source = "idCategoria",target = "categoryId"),
        @Mapping(source = "descripcion",target = "category"),
        @Mapping(source = "estado",target = "active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos",ignore = true)
    Categoria toCategoria(Category category);

}
