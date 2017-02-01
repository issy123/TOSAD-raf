CREATE OR REPLACE TRIGGER BRG_AOTH_BEFORE_{table_name}_{id}_TRG
BEFORE DELETE OR INSERT OR UPDATE
ON {attribute_table}
FOR EACH ROW
DECLARE
  L_OPER        VARCHAR2(3);
  L_ERROR_STACK VARCHAR2(4000);
  L_PASSED      BOOLEAN := TRUE;
BEGIN
  IF INSERTING
  THEN
    L_OPER := 'INS';
  ELSIF UPDATING
  THEN
    L_OPER := 'UPD';
  ELSIF DELETING
  THEN
    L_OPER := 'DEL';
  END IF;
  IF L_OPER IN ('INS', 'UPD')
  THEN
    L_PASSED := {other_statement};
    END IF;
  IF NOT l_PASSED
  THEN
    RAISE_APPLICATION_ERROR(-20000, {error});
  END IF;
END;