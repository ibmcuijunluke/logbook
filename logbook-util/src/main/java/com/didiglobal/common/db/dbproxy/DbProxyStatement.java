package com.didiglobal.common.db.dbproxy;

import com.didiglobal.common.db.ForwardingStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author liyanling
 * @date 2021/11/23 4:13 下午
 */

public class DbProxyStatement extends ForwardingStatement {

    private final DbProxyConnection connection;

    public DbProxyStatement(Statement delegate, DbProxyConnection connection) {
        super(delegate);
        this.connection = connection;
    }

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        return super.executeQuery(connection.wrapWithStatementComment(sql));
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        return super.executeUpdate(connection.wrapWithStatementComment(sql));
    }

    @Override
    public boolean execute(String sql) throws SQLException {
        return super.execute(connection.wrapWithStatementComment(sql));
    }

    @Override
    public void addBatch(String sql) throws SQLException {
        super.addBatch(connection.wrapWithStatementComment(sql));
    }

    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return super.executeUpdate(connection.wrapWithStatementComment(sql), autoGeneratedKeys);
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return super.executeUpdate(connection.wrapWithStatementComment(sql), columnIndexes);
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return super.executeUpdate(connection.wrapWithStatementComment(sql), columnNames);
    }

    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return super.execute(connection.wrapWithStatementComment(sql), autoGeneratedKeys);
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return super.execute(connection.wrapWithStatementComment(sql), columnIndexes);
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return super.execute(connection.wrapWithStatementComment(sql), columnNames);
    }

    @Override
    public long executeLargeUpdate(String sql) throws SQLException {
        return super.executeLargeUpdate(connection.wrapWithStatementComment(sql));
    }

    @Override
    public long executeLargeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return super.executeLargeUpdate(connection.wrapWithStatementComment(sql), autoGeneratedKeys);
    }

    @Override
    public long executeLargeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return super.executeLargeUpdate(connection.wrapWithStatementComment(sql), columnIndexes);
    }

    @Override
    public long executeLargeUpdate(String sql, String[] columnNames) throws SQLException {
        return super.executeLargeUpdate(connection.wrapWithStatementComment(sql), columnNames);
    }
}
