package stock.control.entities;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.ImmutableMutabilityPlan;
import org.hibernate.type.descriptor.spi.JdbcRecommendedSqlTypeMappingContext;

import java.util.Properties;

public class QDescriptor extends AbstractTypeDescriptor<Quantity> {

    protected QDescriptor() {
        super(Quantity.class, new ImmutableMutabilityPlan<>());
    }

    @Override
    public String toString(Quantity value) {
        return null;
    }

    @Override
    public Quantity fromString(String string) {
        return null;
    }

    @Override
    public <X> X unwrap(Quantity value, Class<X> type, WrapperOptions options) {
        return null;
    }

    @Override
    public <X> Quantity wrap(X value, WrapperOptions options) {
        return null;
    }

    @Override
    public SqlTypeDescriptor getJdbcRecommendedSqlType(JdbcRecommendedSqlTypeMappingContext context) {
        return null;
    }


}
